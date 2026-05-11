package minggu11;

import org.w3c.dom.Node;

public class tgsNode {
    tgsMahasiswa data;
    tgsNode next;

    public tgsNode(tgsMahasiswa data) {
        this.data = data;
        this.next = null;
    }
}
