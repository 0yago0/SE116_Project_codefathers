public class Main {
    public static void main(String[] args){
        SimulationManager sm1 = new SimulationManager();
        char[][] dummyMap = {
                {'H', 'R', 'C', 'E'},
                {'R', 'P', 'R', 'I'},
                {'E', 'W', 'R', 'H'}
        };
        int ticks = 5;
        System.out.println("Running Objectville Simulation for " + ticks + " ticks.");
        sm1.runSimulation(ticks , dummyMap);
        System.out.println("\n Simulation completed.");


    }
}
