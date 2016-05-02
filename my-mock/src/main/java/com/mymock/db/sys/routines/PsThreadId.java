/**
 * This class is generated by jOOQ
 */
package com.mymock.db.sys.routines;


import com.mymock.db.sys.Sys;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


/**
 * 
 *  Description
 *  
 *  Return the Performance Schema THREAD_ID for the specified connection ID.
 *  
 *  Parameters
 *  
 *  in_connection_id (BIGINT UNSIGNED):
 *  The id of the connection to return the thread id for. If NULL, the current
 *  connection thread id is returned.
 *  
 *  Example
 *  
 *  mysql> SELECT sys.ps_thread_id(79);
 *  +----------------------+
 *  | sys.ps_thread_id(79) |
 *  +----------------------+
 *  |                   98 |
 *  +----------------------+
 *  1 row in set (0.00 sec)
 *  
 *  mysql> SELECT sys.ps_thread_id(CONNECTION_ID());
 *  +-----------------------------------+
 *  | sys.ps_thread_id(CONNECTION_ID()) |
 *  +-----------------------------------+
 *  |                                98 |
 *  +-----------------------------------+
 *  1 row in set (0.00 sec)
 *  
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PsThreadId extends AbstractRoutine<Long> {

	private static final long serialVersionUID = -997349374;

	/**
	 * The parameter <code>sys.ps_thread_id.RETURN_VALUE</code>.
	 */
	public static final Parameter<Long> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BIGINT, false);

	/**
	 * The parameter <code>sys.ps_thread_id.in_connection_id</code>.
	 */
	public static final Parameter<Long> IN_CONNECTION_ID = createParameter("in_connection_id", org.jooq.impl.SQLDataType.BIGINT, false);

	/**
	 * Create a new routine call instance
	 */
	public PsThreadId() {
		super("ps_thread_id", Sys.SYS, org.jooq.impl.SQLDataType.BIGINT);

		setReturnParameter(RETURN_VALUE);
		addInParameter(IN_CONNECTION_ID);
	}

	/**
	 * Set the <code>in_connection_id</code> parameter IN value to the routine
	 */
	public void setInConnectionId(Long value) {
		setValue(IN_CONNECTION_ID, value);
	}

	/**
	 * Set the <code>in_connection_id</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setInConnectionId(Field<Long> field) {
		setField(IN_CONNECTION_ID, field);
	}
}