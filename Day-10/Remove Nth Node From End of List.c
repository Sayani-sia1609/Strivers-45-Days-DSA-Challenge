/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    struct ListNode* temp=head;
    int len=0;
    while(temp!=NULL){
        temp=temp->next;
        len++;
    }
    if(n==len){
        struct ListNode* del=head;
        head=head->next;
        free(del);
        return head;
    }
    int pos=len-n-1;
    temp=head;

    for(int i=0;i<pos;i++){
        temp=temp->next;
    }

    struct ListNode* del=temp->next;
    temp->next=temp->next->next;
    free(del);
    return head;
}
