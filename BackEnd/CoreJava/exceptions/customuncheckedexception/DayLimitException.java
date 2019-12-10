package customuncheckedexception;

public class DayLimitException extends RuntimeException
{
	String msg="Exceeds Daylimit";

	public DayLimitException() {
		super();
	}

	public DayLimitException(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		
		return msg;
	}
	

}
