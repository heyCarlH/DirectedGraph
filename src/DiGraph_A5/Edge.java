package DiGraph_A5;

public class Edge {
	Node currNode;
	Node destNode;
	long weight;
	long id;
	String label;

	public Edge(Node source, Node destination, long id, long weight, String label) {
		this.weight = weight;
		this.currNode = source;
		this.destNode = destination;
		this.id = id;
		this.label = label;
	}

	public Node getCurrent() {
		return this.currNode;
	}

	public Node getDestination() {
		return this.destNode;
	}

	public long getWeight() {
		return this.weight;
	}

	public long getId() {
		return this.id;
	}

	public String getLabel() {
		return this.label;
	}

	@Override
	public String toString() {
		String s = "";
		s += "Current: " + this.currNode + " Destionation: " + this.destNode + " EdgeWeight: " + this.weight
				+ " EdgeIndex: " + this.id + " EdgeName: " + this.label + "\n";
		return s;
	}
}
