package firstyearportfolio;

public class empleados {
    public static void main(String[] args) {
        String name, lastname, age;
        int[][][] employees = new int[5][5][5];
        empleado emp1 = new empleado();
        employeeNames(employees);
    }

    public static int employeeNames(int[][][] array) {
        int i;
        int j = 0;
        int k = 0;
        int value = 0;
        for (i = 21; i < 26; i++) {
            value = array[i][j][k] = i;
        }
        return value;

    }

    public static void employeeNames(String[][][] array) {

    }

    static class empleado {
        private String nombre, apellido;
        private int edad;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setTipo(String apellido) {
            this.apellido = apellido;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }
    }
}
