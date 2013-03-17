//Use 2 pointers p1 and p2. Move p2 by n-1 times. Now start moving p1 and p2 till p2 reaches end of list


NthtoLastElement(Node head,int n)
{

Node p1 = head;
Node p2 = head;
for (int i = 0; i < n ; i++) { // make then n nodes apart.
    if (p2 == null) {
        return null;
    }
    p2 = p2.next;
}
while (p2 != null) { // move till p2 goes past the end of the list.
    p1 = p1.next;
    p2 = p2.next;
}
return p1;

}