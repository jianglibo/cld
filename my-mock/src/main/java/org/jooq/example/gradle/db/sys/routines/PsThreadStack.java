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
 *  Outputs a JSON formatted stack of all statements, stages and events
 *  within Performance Schema for the specified thread.
 *  
 *  Parameters
 *  
 *  thd_id (BIGINT UNSIGNED):
 *  The id of the thread to trace. This should match the thread_id
 *  column from the performance_schema.threads table.
 *  in_verbose (BOOLEAN):
 *  Include file:lineno information in the events.
 *  
 *  Example
 *  
 *  (line separation added for output)
 *  
 *  mysql> SELECT sys.ps_thread_stack(37, FALSE) AS thread_stack\G
 *  *************************** 1. row ***************************
 *  thread_stack: {"rankdir": "LR","nodesep": "0.10","stack_created": "2014-02-19 
 * 13:39:03",
 *  "mysql_version": "5.7.3-m13","mysql_user": "root@localhost","events": 
 * 
 *  [{"nesting_event_id": "0", "event_id": "10", "timer_wait": 256.35, "event_info": 
 * 
 *  "sql/select", "wait_info": "select @@version_comment limit 1\nerrors: 
 * 0\nwarnings: 0\nlock time:
 *  ...
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
public class PsThreadStack extends AbstractRoutine<String> {

	private static final long serialVersionUID = -1429630356;

	/**
	 * The parameter <code>sys.ps_thread_stack.RETURN_VALUE</code>.
	 */
	public static final Parameter<String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.CLOB, false);

	/**
	 * The parameter <code>sys.ps_thread_stack.thd_id</code>.
	 */
	public static final Parameter<Long> THD_ID = createParameter("thd_id", org.jooq.impl.SQLDataType.BIGINT, false);

	/**
	 * The parameter <code>sys.ps_thread_stack.debug</code>.
	 */
	public static final Parameter<Byte> DEBUG = createParameter("debug", org.jooq.impl.SQLDataType.TINYINT, false);

	/**
	 * Create a new routine call instance
	 */
	public PsThreadStack() {
		super("ps_thread_stack", Sys.SYS, org.jooq.impl.SQLDataType.CLOB);

		setReturnParameter(RETURN_VALUE);
		addInParameter(THD_ID);
		addInParameter(DEBUG);
	}

	/**
	 * Set the <code>thd_id</code> parameter IN value to the routine
	 */
	public void setThdId(Long value) {
		setValue(THD_ID, value);
	}

	/**
	 * Set the <code>thd_id</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setThdId(Field<Long> field) {
		setField(THD_ID, field);
	}

	/**
	 * Set the <code>debug</code> parameter IN value to the routine
	 */
	public void setDebug(Byte value) {
		setValue(DEBUG, value);
	}

	/**
	 * Set the <code>debug</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setDebug(Field<Byte> field) {
		setField(DEBUG, field);
	}
}
