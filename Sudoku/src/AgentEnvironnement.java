import jade.core.Agent;


public class AgentEnvironnement extends Agent {

	public void setup(){
		System.out.println( "Hello ! Je suis " + getLocalName() );
	}

}
