	import jade.core.Profile;
	import jade.core.ProfileImpl;
	import jade.core.Runtime;
	import jade.wrapper.AgentContainer;
	import jade.wrapper.AgentController;

public class MainContenair {

		public static String MAIN_PROPERTIES_FILE = "property";
		public static void main(String[] args){
			Runtime rt= Runtime.instance();
			Profile p = null;
			try{
				p = new ProfileImpl(MAIN_PROPERTIES_FILE);
				AgentContainer mc=rt.createMainContainer(p);
				mc.start();

				AgentController sim = mc.createNewAgent("AgentSimulation", "AgentSimulation",null);

				sim.start();
			}
			catch(Exception e){
				System.out.println("Error : " + e);
			}
		}


	}

