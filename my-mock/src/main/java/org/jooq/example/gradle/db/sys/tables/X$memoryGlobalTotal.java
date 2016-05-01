/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.sys.tables;


import java.math.BigInteger;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.example.gradle.db.sys.Sys;
import org.jooq.example.gradle.db.sys.tables.records.X$memoryGlobalTotalRecord;
import org.jooq.impl.TableImpl;


/**
 * VIEW
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class X$memoryGlobalTotal extends TableImpl<X$memoryGlobalTotalRecord> {

	private static final long serialVersionUID = -1768858401;

	/**
	 * The reference instance of <code>sys.x$memory_global_total</code>
	 */
	public static final X$memoryGlobalTotal X$MEMORY_GLOBAL_TOTAL = new X$memoryGlobalTotal();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<X$memoryGlobalTotalRecord> getRecordType() {
		return X$memoryGlobalTotalRecord.class;
	}

	/**
	 * The column <code>sys.x$memory_global_total.total_allocated</code>.
	 */
	public final TableField<X$memoryGlobalTotalRecord, BigInteger> TOTAL_ALLOCATED = createField("total_allocated", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(41), this, "");

	/**
	 * Create a <code>sys.x$memory_global_total</code> table reference
	 */
	public X$memoryGlobalTotal() {
		this("x$memory_global_total", null);
	}

	/**
	 * Create an aliased <code>sys.x$memory_global_total</code> table reference
	 */
	public X$memoryGlobalTotal(String alias) {
		this(alias, X$MEMORY_GLOBAL_TOTAL);
	}

	private X$memoryGlobalTotal(String alias, Table<X$memoryGlobalTotalRecord> aliased) {
		this(alias, aliased, null);
	}

	private X$memoryGlobalTotal(String alias, Table<X$memoryGlobalTotalRecord> aliased, Field<?>[] parameters) {
		super(alias, Sys.SYS, aliased, parameters, "VIEW");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X$memoryGlobalTotal as(String alias) {
		return new X$memoryGlobalTotal(alias, this);
	}

	/**
	 * Rename this table
	 */
	public X$memoryGlobalTotal rename(String name) {
		return new X$memoryGlobalTotal(name, null);
	}
}
