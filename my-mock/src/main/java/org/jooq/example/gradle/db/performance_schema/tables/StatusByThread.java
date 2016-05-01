/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.performance_schema.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.example.gradle.db.performance_schema.PerformanceSchema;
import org.jooq.example.gradle.db.performance_schema.tables.records.StatusByThreadRecord;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;


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
public class StatusByThread extends TableImpl<StatusByThreadRecord> {

	private static final long serialVersionUID = 83708622;

	/**
	 * The reference instance of <code>performance_schema.status_by_thread</code>
	 */
	public static final StatusByThread STATUS_BY_THREAD = new StatusByThread();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<StatusByThreadRecord> getRecordType() {
		return StatusByThreadRecord.class;
	}

	/**
	 * The column <code>performance_schema.status_by_thread.THREAD_ID</code>.
	 */
	public final TableField<StatusByThreadRecord, ULong> THREAD_ID = createField("THREAD_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.status_by_thread.VARIABLE_NAME</code>.
	 */
	public final TableField<StatusByThreadRecord, String> VARIABLE_NAME = createField("VARIABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

	/**
	 * The column <code>performance_schema.status_by_thread.VARIABLE_VALUE</code>.
	 */
	public final TableField<StatusByThreadRecord, String> VARIABLE_VALUE = createField("VARIABLE_VALUE", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

	/**
	 * Create a <code>performance_schema.status_by_thread</code> table reference
	 */
	public StatusByThread() {
		this("status_by_thread", null);
	}

	/**
	 * Create an aliased <code>performance_schema.status_by_thread</code> table reference
	 */
	public StatusByThread(String alias) {
		this(alias, STATUS_BY_THREAD);
	}

	private StatusByThread(String alias, Table<StatusByThreadRecord> aliased) {
		this(alias, aliased, null);
	}

	private StatusByThread(String alias, Table<StatusByThreadRecord> aliased, Field<?>[] parameters) {
		super(alias, PerformanceSchema.PERFORMANCE_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatusByThread as(String alias) {
		return new StatusByThread(alias, this);
	}

	/**
	 * Rename this table
	 */
	public StatusByThread rename(String name) {
		return new StatusByThread(name, null);
	}
}
