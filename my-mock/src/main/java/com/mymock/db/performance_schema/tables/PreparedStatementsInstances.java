/**
 * This class is generated by jOOQ
 */
package com.mymock.db.performance_schema.tables;


import com.mymock.db.performance_schema.PerformanceSchema;
import com.mymock.db.performance_schema.enums.PreparedStatementsInstancesOwnerObjectType;
import com.mymock.db.performance_schema.tables.records.PreparedStatementsInstancesRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
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
public class PreparedStatementsInstances extends TableImpl<PreparedStatementsInstancesRecord> {

	private static final long serialVersionUID = -1829361760;

	/**
	 * The reference instance of <code>performance_schema.prepared_statements_instances</code>
	 */
	public static final PreparedStatementsInstances PREPARED_STATEMENTS_INSTANCES = new PreparedStatementsInstances();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<PreparedStatementsInstancesRecord> getRecordType() {
		return PreparedStatementsInstancesRecord.class;
	}

	/**
	 * The column <code>performance_schema.prepared_statements_instances.OBJECT_INSTANCE_BEGIN</code>.
	 */
	public final TableField<PreparedStatementsInstancesRecord, ULong> OBJECT_INSTANCE_BEGIN = createField("OBJECT_INSTANCE_BEGIN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.prepared_statements_instances.STATEMENT_ID</code>.
	 */
	public final TableField<PreparedStatementsInstancesRecord, ULong> STATEMENT_ID = createField("STATEMENT_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.prepared_statements_instances.STATEMENT_NAME</code>.
	 */
	public final TableField<PreparedStatementsInstancesRecord, String> STATEMENT_NAME = createField("STATEMENT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>performance_schema.prepared_statements_instances.SQL_TEXT</code>.
	 */
	public final TableField<PreparedStatementsInstancesRecord, String> SQL_TEXT = createField("SQL_TEXT", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.prepared_statements_instances.OWNER_THREAD_ID</code>.
	 */
	public final TableField<PreparedStatementsInstancesRecord, ULong> OWNER_THREAD_ID = createField("OWNER_THREAD_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.prepared_statements_instances.OWNER_EVENT_ID</code>.
	 */
	public final TableField<PreparedStatementsInstancesRecord, ULong> OWNER_EVENT_ID = createField("OWNER_EVENT_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.prepared_statements_instances.OWNER_OBJECT_TYPE</code>.
	 */
	public final TableField<PreparedStatementsInstancesRecord, PreparedStatementsInstancesOwnerObjectType> OWNER_OBJECT_TYPE = createField("OWNER_OBJECT_TYPE", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.mymock.db.performance_schema.enums.PreparedStatementsInstancesOwnerObjectType.class), this, "");

	/**
	 * The column <code>performance_schema.prepared_statements_instances.OWNER_OBJECT_SCHEMA</code>.
	 */
	public final TableField<PreparedStatementsInstancesRecord, String> OWNER_OBJECT_SCHEMA = createField("OWNER_OBJECT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>performance_schema.prepared_statements_instances.OWNER_OBJECT_NAME</code>.
	 */
	public final TableField<PreparedStatementsInstancesRecord, String> OWNER_OBJECT_NAME = createField("OWNER_OBJECT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>performance_schema.prepared_statements_instances.TIMER_PREPARE</code>.
	 */
	public final TableField<PreparedStatementsInstancesRecord, ULong> TIMER_PREPARE = createField("TIMER_PREPARE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.prepared_statements_instances.COUNT_REPREPARE</code>.
	 */
	public final TableField<PreparedStatementsInstancesRecord, ULong> COUNT_REPREPARE = createField("COUNT_REPREPARE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.prepared_statements_instances.COUNT_EXECUTE</code>.
	 */
	public final TableField<PreparedStatementsInstancesRecord, ULong> COUNT_EXECUTE = createField("COUNT_EXECUTE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.prepared_statements_instances.SUM_TIMER_EXECUTE</code>.
	 */
	public final TableField<PreparedStatementsInstancesRecord, ULong> SUM_TIMER_EXECUTE = createField("SUM_TIMER_EXECUTE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.prepared_statements_instances.MIN_TIMER_EXECUTE</code>.
	 */
	public final TableField<PreparedStatementsInstancesRecord, ULong> MIN_TIMER_EXECUTE = createField("MIN_TIMER_EXECUTE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.prepared_statements_instances.AVG_TIMER_EXECUTE</code>.
	 */
	public final TableField<PreparedStatementsInstancesRecord, ULong> AVG_TIMER_EXECUTE = createField("AVG_TIMER_EXECUTE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.prepared_statements_instances.MAX_TIMER_EXECUTE</code>.
	 */
	public final TableField<PreparedStatementsInstancesRecord, ULong> MAX_TIMER_EXECUTE = createField("MAX_TIMER_EXECUTE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.prepared_statements_instances.SUM_LOCK_TIME</code>.
	 */
	public final TableField<PreparedStatementsInstancesRecord, ULong> SUM_LOCK_TIME = createField("SUM_LOCK_TIME", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.prepared_statements_instances.SUM_ERRORS</code>.
	 */
	public final TableField<PreparedStatementsInstancesRecord, ULong> SUM_ERRORS = createField("SUM_ERRORS", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.prepared_statements_instances.SUM_WARNINGS</code>.
	 */
	public final TableField<PreparedStatementsInstancesRecord, ULong> SUM_WARNINGS = createField("SUM_WARNINGS", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.prepared_statements_instances.SUM_ROWS_AFFECTED</code>.
	 */
	public final TableField<PreparedStatementsInstancesRecord, ULong> SUM_ROWS_AFFECTED = createField("SUM_ROWS_AFFECTED", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.prepared_statements_instances.SUM_ROWS_SENT</code>.
	 */
	public final TableField<PreparedStatementsInstancesRecord, ULong> SUM_ROWS_SENT = createField("SUM_ROWS_SENT", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.prepared_statements_instances.SUM_ROWS_EXAMINED</code>.
	 */
	public final TableField<PreparedStatementsInstancesRecord, ULong> SUM_ROWS_EXAMINED = createField("SUM_ROWS_EXAMINED", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.prepared_statements_instances.SUM_CREATED_TMP_DISK_TABLES</code>.
	 */
	public final TableField<PreparedStatementsInstancesRecord, ULong> SUM_CREATED_TMP_DISK_TABLES = createField("SUM_CREATED_TMP_DISK_TABLES", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.prepared_statements_instances.SUM_CREATED_TMP_TABLES</code>.
	 */
	public final TableField<PreparedStatementsInstancesRecord, ULong> SUM_CREATED_TMP_TABLES = createField("SUM_CREATED_TMP_TABLES", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.prepared_statements_instances.SUM_SELECT_FULL_JOIN</code>.
	 */
	public final TableField<PreparedStatementsInstancesRecord, ULong> SUM_SELECT_FULL_JOIN = createField("SUM_SELECT_FULL_JOIN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.prepared_statements_instances.SUM_SELECT_FULL_RANGE_JOIN</code>.
	 */
	public final TableField<PreparedStatementsInstancesRecord, ULong> SUM_SELECT_FULL_RANGE_JOIN = createField("SUM_SELECT_FULL_RANGE_JOIN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.prepared_statements_instances.SUM_SELECT_RANGE</code>.
	 */
	public final TableField<PreparedStatementsInstancesRecord, ULong> SUM_SELECT_RANGE = createField("SUM_SELECT_RANGE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.prepared_statements_instances.SUM_SELECT_RANGE_CHECK</code>.
	 */
	public final TableField<PreparedStatementsInstancesRecord, ULong> SUM_SELECT_RANGE_CHECK = createField("SUM_SELECT_RANGE_CHECK", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.prepared_statements_instances.SUM_SELECT_SCAN</code>.
	 */
	public final TableField<PreparedStatementsInstancesRecord, ULong> SUM_SELECT_SCAN = createField("SUM_SELECT_SCAN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.prepared_statements_instances.SUM_SORT_MERGE_PASSES</code>.
	 */
	public final TableField<PreparedStatementsInstancesRecord, ULong> SUM_SORT_MERGE_PASSES = createField("SUM_SORT_MERGE_PASSES", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.prepared_statements_instances.SUM_SORT_RANGE</code>.
	 */
	public final TableField<PreparedStatementsInstancesRecord, ULong> SUM_SORT_RANGE = createField("SUM_SORT_RANGE", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.prepared_statements_instances.SUM_SORT_ROWS</code>.
	 */
	public final TableField<PreparedStatementsInstancesRecord, ULong> SUM_SORT_ROWS = createField("SUM_SORT_ROWS", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.prepared_statements_instances.SUM_SORT_SCAN</code>.
	 */
	public final TableField<PreparedStatementsInstancesRecord, ULong> SUM_SORT_SCAN = createField("SUM_SORT_SCAN", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.prepared_statements_instances.SUM_NO_INDEX_USED</code>.
	 */
	public final TableField<PreparedStatementsInstancesRecord, ULong> SUM_NO_INDEX_USED = createField("SUM_NO_INDEX_USED", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>performance_schema.prepared_statements_instances.SUM_NO_GOOD_INDEX_USED</code>.
	 */
	public final TableField<PreparedStatementsInstancesRecord, ULong> SUM_NO_GOOD_INDEX_USED = createField("SUM_NO_GOOD_INDEX_USED", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false), this, "");

	/**
	 * Create a <code>performance_schema.prepared_statements_instances</code> table reference
	 */
	public PreparedStatementsInstances() {
		this("prepared_statements_instances", null);
	}

	/**
	 * Create an aliased <code>performance_schema.prepared_statements_instances</code> table reference
	 */
	public PreparedStatementsInstances(String alias) {
		this(alias, PREPARED_STATEMENTS_INSTANCES);
	}

	private PreparedStatementsInstances(String alias, Table<PreparedStatementsInstancesRecord> aliased) {
		this(alias, aliased, null);
	}

	private PreparedStatementsInstances(String alias, Table<PreparedStatementsInstancesRecord> aliased, Field<?>[] parameters) {
		super(alias, PerformanceSchema.PERFORMANCE_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PreparedStatementsInstances as(String alias) {
		return new PreparedStatementsInstances(alias, this);
	}

	/**
	 * Rename this table
	 */
	public PreparedStatementsInstances rename(String name) {
		return new PreparedStatementsInstances(name, null);
	}
}
