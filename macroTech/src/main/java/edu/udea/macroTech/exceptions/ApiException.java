package edu.udea.macroTech.exceptions;


public class ApiException extends Exception {
	private static final long serialVersionUID = 1L;
	private ErrorRq errorDto;

	public ApiException() {
		super();
	}

	public ApiException(ErrorRq errorDto) {
		super(errorDto.getError());
		this.errorDto = errorDto;
	}

	public ApiException(String msg) {
		super(msg);
	}

	public ApiException(String msg, Exception ex) {
		super(msg, ex);
	}

	/**
	 * @return the errorDto
	 */
	public ErrorRq getErrorDto() {
		return errorDto;
	}

	/**
	 * @param errorDto the errorDto to set
	 */
	public void setErrorDto(ErrorRq errorDto) {
		this.errorDto = errorDto;
	}
}
