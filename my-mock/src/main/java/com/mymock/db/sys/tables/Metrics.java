/**
 * This class is generated by jOOQ
 */
package com.mymock.db.sys.tables;


import com.mymock.db.sys.Sys;
import com.mymock.db.sys.tables.records.MetricsRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
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
public class Metrics extends TableImpl<MetricsRecord> {

	private static final long serialVersionUID = 318884668;

	/**
	 * The reference instance of <code>sys.metrics</code>
	 */
	public static final Metrics METRICS = new Metrics();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<MetricsRecord> getRecordType() {
		return MetricsRecord.class;
	}

	/**
	 * The column <code>sys.metrics.Variable_name</code>.
	 */
	public final TableField<MetricsRecord, String> VARIABLE_NAME = createField("Variable_name", org.jooq.impl.SQLDataType.VARCHAR.length(193), this, "");

	/**
	 * The column <code>sys.metrics.Variable_value</code>.
	 */
	public final TableField<MetricsRecord, String> VARIABLE_VALUE = createField("Variable_value", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>sys.metrics.Type</code>.
	 */
	public final TableField<MetricsRecord, String> TYPE = createField("Type", org.jooq.impl.SQLDataType.VARCHAR.length(210), this, "");

	/**
	 * The column <code>sys.metrics.Enabled</code>.
	 */
	public final TableField<MetricsRecord, String> ENABLED = createField("Enabled", org.jooq.impl.SQLDataType.VARCHAR.length(7).nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>sys.metrics</code> table reference
	 */
	public Metrics() {
		this("metrics", null);
	}

	/**
	 * Create an aliased <code>sys.metrics</code> table reference
	 */
	public Metrics(String alias) {
		this(alias, METRICS);
	}

	private Metrics(String alias, Table<MetricsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Metrics(String alias, Table<MetricsRecord> aliased, Field<?>[] parameters) {
		super(alias, Sys.SYS, aliased, parameters, "VIEW");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Metrics as(String alias) {
		return new Metrics(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Metrics rename(String name) {
		return new Metrics(name, null);
	}
}