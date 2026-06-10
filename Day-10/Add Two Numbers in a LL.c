
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    struct ListNode* head=NULL;
    struct ListNode* tail=NULL;
    int carry=0;
    int sum;
    int new_dig;
    while(l1!=NULL || l2!=NULL || carry!=0){
        int digit1=0;
        if(l1!=NULL){
           digit1=l1->val;
        }
        int digit2=0;
        if(l2!=NULL){
           digit2=l2->val;
        }
        sum=digit1+digit2+carry;
        new_dig=sum%10;
        carry=sum/10;
        struct ListNode* newNode=(struct ListNode*)malloc(sizeof(struct ListNode));
        newNode->val = new_dig;
        newNode->next=NULL;
        if(head==NULL){
             head = newNode;
             tail = newNode;
        }
        else{
            tail->next=newNode;
            tail=newNode;
        }
        if(l1 != NULL){
          l1 = l1->next;
        }
        if(l2 != NULL){
           l2 = l2->next;
        }
    }
    return head;
}
