package OrderPackage;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class OrderManagementService {

	/**
	 * Default constructor
	 */
	public OrderManagementService() {
	}

	/**
	 * 
	 */
	private OrderRepository orderRepo;

	/**
	 * 
	 */
	private PartRepository partRepo;


	/**
	 * @param accountID 
	 * @param partIDs 
	 * @return
	 */
	public Order createOrder(int accountID, List<Integer> partIDs) {
		// TODO implement here
		return null;
	}

	/**
	 * @param orderID 
	 * @return
	 */
	public Order getOrder(int orderID) {
		// TODO implement here
		return null;
	}

	/**
	 * @param accountID 
	 * @return
	 */
	public List<Order> getOrdersForUser(int accountID) {
		// TODO implement here
		return null;
	}

	/**
	 * @return
	 */
	public List<Part> listParts() {
		// TODO implement here
		return null;
	}

}