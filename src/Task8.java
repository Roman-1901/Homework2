public class Task8 {
    public static void main(String[] args) {
        var workTime = 640;
        var employee = workTime/8;
        System.out.println("Всего работников в компании – "+ employee + " человек");
        employee = employee + 94;
        workTime = employee * 8;
        System.out.println("Если в компании работает " + employee + " человек, то всего " + workTime + " часов работы может быть поделено между сотрудниками\"");
    }
}

