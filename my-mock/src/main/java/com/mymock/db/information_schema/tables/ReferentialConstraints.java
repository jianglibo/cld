/**
 * This class is generated by jOOQ
 */
package com.mymock.db.information_schema.tables;


import com.mymock.db.information_schema.InformationSchema;
import com.mymock.db.information_schema.tables.records.ReferentialConstraintsRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
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
public class ReferentialConstraints extends TableImpl<ReferentialConstraintsRecord> {

	private static final long serialVersionUID = -1263625801;

	/**
	 * The reference instance of <code>information_schema.REFERENTIAL_CONSTRAINTS</code>
	 */
	public static final ReferentialConstraints REFERENTIAL_CONSTRAINTS = new ReferentialConstraints();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ReferentialConstraintsRecord> getRecordType() {
		return ReferentialConstraintsRecord.class;
	}

	/**
	 * The column <code>information_schema.REFERENTIAL_CONSTRAINTS.CONSTRAINT_CATALOG</code>.
	 */
	public final TableField<ReferentialConstraintsRecord, String> CONSTRAINT_CATALOG = createField("CONSTRAINT_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(512).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.REFERENTIAL_CONSTRAINTS.CONSTRAINT_SCHEMA</code>.
	 */
	public final TableField<ReferentialConstraintsRecord, String> CONSTRAINT_SCHEMA = createField("CONSTRAINT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.REFERENTIAL_CONSTRAINTS.CONSTRAINT_NAME</code>.
	 */
	public final TableField<ReferentialConstraintsRecord, String> CONSTRAINT_NAME = createField("CONSTRAINT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_CATALOG</code>.
	 */
	public final TableField<ReferentialConstraintsRecord, String> UNIQUE_CONSTRAINT_CATALOG = createField("UNIQUE_CONSTRAINT_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(512).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_SCHEMA</code>.
	 */
	public final TableField<ReferentialConstraintsRecord, String> UNIQUE_CONSTRAINT_SCHEMA = createField("UNIQUE_CONSTRAINT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_NAME</code>.
	 */
	public final TableField<ReferentialConstraintsRecord, String> UNIQUE_CONSTRAINT_NAME = createField("UNIQUE_CONSTRAINT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64), this, "");

	/**
	 * The column <code>information_schema.REFERENTIAL_CONSTRAINTS.MATCH_OPTION</code>.
	 */
	public final TableField<ReferentialConstraintsRecord, String> MATCH_OPTION = createField("MATCH_OPTION", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.REFERENTIAL_CONSTRAINTS.UPDATE_RULE</code>.
	 */
	public final TableField<ReferentialConstraintsRecord, String> UPDATE_RULE = createField("UPDATE_RULE", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.REFERENTIAL_CONSTRAINTS.DELETE_RULE</code>.
	 */
	public final TableField<ReferentialConstraintsRecord, String> DELETE_RULE = createField("DELETE_RULE", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.REFERENTIAL_CONSTRAINTS.TABLE_NAME</code>.
	 */
	public final TableField<ReferentialConstraintsRecord, String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>information_schema.REFERENTIAL_CONSTRAINTS.REFERENCED_TABLE_NAME</code>.
	 */
	public final TableField<ReferentialConstraintsRecord, String> REFERENCED_TABLE_NAME = createField("REFERENCED_TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>information_schema.REFERENTIAL_CONSTRAINTS</code> table reference
	 */
	public ReferentialConstraints() {
		this("REFERENTIAL_CONSTRAINTS", null);
	}

	/**
	 * Create an aliased <code>information_schema.REFERENTIAL_CONSTRAINTS</code> table reference
	 */
	public ReferentialConstraints(String alias) {
		this(alias, REFERENTIAL_CONSTRAINTS);
	}

	private ReferentialConstraints(String alias, Table<ReferentialConstraintsRecord> aliased) {
		this(alias, aliased, null);
	}

	private ReferentialConstraints(String alias, Table<ReferentialConstraintsRecord> aliased, Field<?>[] parameters) {
		super(alias, InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ReferentialConstraints as(String alias) {
		return new ReferentialConstraints(alias, this);
	}

	/**
	 * Rename this table
	 */
	public ReferentialConstraints rename(String name) {
		return new ReferentialConstraints(name, null);
	}
}
