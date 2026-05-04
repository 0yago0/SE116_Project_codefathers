public class Main {
    public static void main(String[] args){
        SimulationManager sm1 = new SimulationManager();
        int ticks = 5;
        System.out.println("Running Objectville Simulation for " + ticks + " ticks.");
        sm1.runSimulation(ticks);
        System.out.println("\n Simulation completed.");


    }
}
