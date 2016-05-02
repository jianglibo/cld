/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.sys.routines;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.example.gradle.db.sys.Sys;
import org.jooq.impl.AbstractRoutine;


/**
 * 
 *  Description
 *  
 *  Return the user@host account for the given Performance Schema thread id.
 *  
 *  Parameters
 *  
 *  in_thread_id (BIGINT UNSIGNED):
 *  The id of the thread to return the account for.
 *  
 *  Example
 *  
 *  mysql> select thread_id, processlist_user, processlist_host from performance_schema.threads 
 * where type = 'foreground';
 *  +-----------+------------------+------------------+
 *  | thread_id | processlist_user | processlist_host |
 *  +-----------+------------------+------------------+
 *  |        23 | NULL             | NULL             |
 *  |        30 | root             | localhost        |
 *  |        31 | msandbox         | localhost        |
 *  |        32 | msandbox         | localhost        |
 *  +-----------+------------------+------------------+
 *  4 rows in set (0.00 sec)
 *  
 *  mysql> select sys.ps_thread_account(31);
 *  +---------------------------+
 *  | sys.ps_thread_account(31) |
 *  +---------------------------+
 *  | msandbox@localhost        |
 *  +---------------------------+
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
public class PsThreadAccount extends AbstractRoutine<String> {

	private static final long serialVersionUID = 309748585;

	/**
	 * The parameter <code>sys.ps_thread_account.RETURN_VALUE</code>.
	 */
	public static final Parameter<String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.CLOB, false);

	/**
	 * The parameter <code>sys.ps_thread_account.in_thread_id</code>.
	 */
	public static final Parameter<Long> IN_THREAD_ID = createParameter("in_thread_id", org.jooq.impl.SQLDataType.BIGINT, false);

	/**
	 * Create a new routine call instance
	 */
	public PsThreadAccount() {
		super("ps_thread_account", Sys.SYS, org.jooq.impl.SQLDataType.CLOB);

		setReturnParameter(RETURN_VALUE);
		addInParameter(IN_THREAD_ID);
	}

	/**
	 * Set the <code>in_thread_id</code> parameter IN value to the routine
	 */
	public void setInThreadId(Long value) {
		setValue(IN_THREAD_ID, value);
	}

	/**
	 * Set the <code>in_thread_id</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setInThreadId(Field<Long> field) {
		setField(IN_THREAD_ID, field);
	}
}