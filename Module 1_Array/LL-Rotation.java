Node leftRotate(Node x) {
        System.out.println("Performing LEFT Rotation on node " + x.d);

        Node y = x.r;
        Node T2 = y.l;

        y.l = x;
        x.r = T2;

        x.h = Math.max(height(x.l), height(x.r)) + 1;
        y.h = Math.max(height(y.l), height(y.r)) + 1;

        return y;
    }
    
    
    class Node {
        int d;
        int h;
        Node l, r;

        Node(int d) {
            this.d = d;
            this.h = 1;
        }
    }
    
    
    
