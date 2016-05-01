/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.performance_schema.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.example.gradle.db.performance_schema.PerformanceSchema;
import org.jooq.example.gradle.db.performance_schema.tables.records.StatusByUserRecord;
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
public class StatusByUser extends TableImpl<StatusByUserRecord> {

	private static final long serialVersionUID = 1548244184;

	/**
	 * The reference instance of <code>performance_schema.status_by_user</code>
	 */
	public static final StatusByUser STATUS_BY_USER = new StatusByUser();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<StatusByUserRecord> getRecordType() {
		return StatusByUserRecord.class;
	}

	/**
	 * The column <code>performance_schema.status_by_user.USER</code>.
	 */
	public final TableField<StatusByUserRecord, String> USER = createField("USER", org.jooq.impl.SQLDataType.CHAR.length(32), this, "");

	/**
	 * The column <code>performance_schema.status_by_user.VARIABLE_NAME</code>.
	 */
	public final TableField<StatusByUserRecord, String> VARIABLE_NAME = createField("VARIABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

	/**
	 * The column <code>performance_schema.status_by_user.VARIABLE_VALUE</code>.
	 */
	public final TableField<StatusByUserRecord, String> VARIABLE_VALUE = createField("VARIABLE_VALUE", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

	/**
	 * Create a <code>performance_schema.status_by_user</code> table reference
	 */
	public StatusByUser() {
		this("status_by_user", null);
	}

	/**
	 * Create an aliased <code>performance_schema.status_by_user</code> table reference
	 */
	public StatusByUser(String alias) {
		this(alias, STATUS_BY_USER);
	}

	private StatusByUser(String alias, Table<StatusByUserRecord> aliased) {
		this(alias, aliased, null);
	}

	private StatusByUser(String alias, Table<StatusByUserRecord> aliased, Field<?>[] parameters) {
		super(alias, PerformanceSchema.PERFORMANCE_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StatusByUser as(String alias) {
		return new StatusByUser(alias, this);
	}

	/**
	 * Rename this table
	 */
	public StatusByUser rename(String name) {
		return new StatusByUser(name, null);
	}
}
