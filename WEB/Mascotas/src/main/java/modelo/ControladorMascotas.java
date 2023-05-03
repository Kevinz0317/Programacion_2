package modelo;

import java.util.ArrayList;
import java.util.List;

public class ControladorMascotas {
    private List<Mascota> mascotas;
    private double edadPromedio;
    private int totalCaninos;
    private int totalFelinos;

    public ControladorMascotas() {
        mascotas = new ArrayList<>();
        edadPromedio = 0;
        totalCaninos = 0;
        totalFelinos = 0;
    }

    public void agregarMascota(String tipo, String nombre, String raza, String color, int edad, int nivelEntrenamiento, boolean libreToxoplasmosis) {
        if (tipo.equals("canino")) {
            mascotas.add(new Canino(nombre, raza, color, edad, nivelEntrenamiento));
            totalCaninos++;
        } else if (tipo.equals("felino")) {
            mascotas.add(new Felino(nombre, raza, color, edad, libreToxoplasmosis));
            totalFelinos++;
        }
        // Recalcula la edad promedio
        calcularEdadPromedio();
    }

    public double getEdadPromedio() {
        return edadPromedio;
    }

    public int getTotalCaninos() {
        return totalCaninos;
    }

    public int getTotalFelinos() {
        return totalFelinos;
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public void retirarMascota(int index) {
        if (index >= 0 && index < mascotas.size()) {
            Mascota mascota = mascotas.get(index);
            if (mascota instanceof Canino) {
                totalCaninos--;
            } else if (mascota instanceof Felino) {
                totalFelinos--;
            }
            mascotas.remove(index);
            // Recalcula la edad promedio
            calcularEdadPromedio();
        }
    }

    private void calcularEdadPromedio() {
        if (mascotas.isEmpty()) {
            edadPromedio = 0;
        } else {
            int sumaEdades = 0;
            for (Mascota mascota : mascotas) {
                sumaEdades += mascota.getEdad();
            }
            edadPromedio = (double) sumaEdades / mascotas.size();
        }
    }
    private void mostrarMascotas(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.setAttribute("mascotas", mascotas);
    request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
}
}
