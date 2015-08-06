package siemens.plm.bankaccountkata;

public class MyClass {
	private ICollaborator1 collaborator1;
	private ICollaborator2 collaborator2;
	private ICollaborator3 collaborator3;
	private int value;
	public MyClass(ICollaborator1 collaborator1, ICollaborator2 collaborator2, ICollaborator3 collaborator3)
	{
		this.collaborator1 = collaborator1;
		this.collaborator2 = collaborator2;
		this.collaborator3 = collaborator3;
		value = 0;
	}
	public void SetValue(int value) {this.value = value;}
	
    public int BehaviorIWantToTest()
    {
        int result = collaborator1.Method1();
        if (result < 0)
        {
            collaborator2.Method2(value);
            return -1;
        }
        else if (result == 0)
        {
            result = collaborator3.Method3();
        }
        return result;
    }
}