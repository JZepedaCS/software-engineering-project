package OrderPackage;

import java.io.*;
import java.math.BigDecimal;
import java.util.*;

/**
 * 
 */
public class Order {

	/**
	 * Default constructor
	 */
	public Order() {
	}

	/**
	 * 
	 */
	private int orderID;

	/**
	 * 
	 */
	private int accountID;

	/**
	 * 
	 */
	private List<Part> parts;

	/**
	 * 
	 */
	private BigDecimal totalPrice;

	/**
	 * 
	 */
	private Date orderDate;

	/**
	 * 
	 */
	private String orderStatus;





	/**
	 * @return
	 */
	public BigDecimal getTotalPrice() {
		// TODO implement here
		return null;
	}

	/**
	 * @return
	 */
	public List<Part> getParts() {
		// TODO implement here
		return null;
	}

}