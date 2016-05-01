/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.performance_schema.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.example.gradle.db.performance_schema.PerformanceSchema;
import org.jooq.example.gradle.db.performance_schema.tables.records.StatusByHostRecord;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StatusByHost extends TableImpl<StatusByHostRecord> {

	private static final long serialVersionUID = 545477361;

	/**
	 * The reference instance of <code>performance_schema.status_by_host</code>
	 */
	public static final StatusByHost STATUS_BY_HOST = new StatusByHost();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<StatusByHostRecord> getRecordType() {
		return StatusByHostRecord.class;
	}

	/**
	 * The column <code>performance_schema.status_by_host.HOST</code>.
	 */
	public final TableField<StatusByHostRecord, String> HOST = createField("HOST", org.jooq.impl.SQLDataType.CHAR.length(60), this, "");

	/**
	 * The column <code>performance_schema.status_by_host.VARIABLE_NAME</code>.
	 */
	public final TableField<StatusByHostRecord, String> VARIABLE_NAME = createField("VARIABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

	/**
	 * The column <code>performance_schema.status_by_host.VARIABLE_VALUE</code>.
	 */
	public final TableField<StatusByHostRecord, String> VARIABLE_VALUE = createField("VARIABLE_VALUE", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

	/**
	 * Create a <code>performance_schema.status_by_host</code> table reference
	 */
	public StatusByHost() {
		this("status_by_host", null);
	}

	/**
	 * Create an aliased <code>performance_schema.status_by_host</code> table reference
	 */
	public StatusByHost(String alias) {
		this(alias, STATUS_BY_HOST);
	}

	private StatusByHost(String alias, Table<StatusByHostRecord> aliased) {
		this(alias, aliased, null);
	}

	private StatusByHost(String alias, Table<StatusByHostRecord> aliased, Field<?>[] parameters) {
		super(alias, PerformanceSchema.PERFORMANCE_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatusByHost as(String alias) {
		return new StatusByHost(alias, this);
	}

	/**
	 * Rename this table
	 */
	public StatusByHost rename(String name) {
		return new StatusByHost(name, null);
	}
}
