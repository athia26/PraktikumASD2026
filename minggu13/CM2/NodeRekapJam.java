package minggu13.CM2;

public class NodeRekapJam { //node untuk double linked list rekapan jam 
    RekapJam dataPerJam;
    NodeRekapJam next, prev;
    
    public NodeRekapJam(RekapJam data){
        this.dataPerJam = data;
    }
}