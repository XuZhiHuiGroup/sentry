/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.sentry.provider.db.service.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-05-05")
public class TListSentryRolesResponse implements org.apache.thrift.TBase<TListSentryRolesResponse, TListSentryRolesResponse._Fields>, java.io.Serializable, Cloneable, Comparable<TListSentryRolesResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TListSentryRolesResponse");

  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField ROLES_FIELD_DESC = new org.apache.thrift.protocol.TField("roles", org.apache.thrift.protocol.TType.SET, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TListSentryRolesResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TListSentryRolesResponseTupleSchemeFactory());
  }

  private org.apache.sentry.service.thrift.TSentryResponseStatus status; // required
  private Set<TSentryRole> roles; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STATUS((short)1, "status"),
    ROLES((short)2, "roles");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // STATUS
          return STATUS;
        case 2: // ROLES
          return ROLES;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.ROLES};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, org.apache.sentry.service.thrift.TSentryResponseStatus.class)));
    tmpMap.put(_Fields.ROLES, new org.apache.thrift.meta_data.FieldMetaData("roles", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TSentryRole.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TListSentryRolesResponse.class, metaDataMap);
  }

  public TListSentryRolesResponse() {
  }

  public TListSentryRolesResponse(
    org.apache.sentry.service.thrift.TSentryResponseStatus status)
  {
    this();
    this.status = status;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TListSentryRolesResponse(TListSentryRolesResponse other) {
    if (other.isSetStatus()) {
      this.status = new org.apache.sentry.service.thrift.TSentryResponseStatus(other.status);
    }
    if (other.isSetRoles()) {
      Set<TSentryRole> __this__roles = new HashSet<TSentryRole>(other.roles.size());
      for (TSentryRole other_element : other.roles) {
        __this__roles.add(new TSentryRole(other_element));
      }
      this.roles = __this__roles;
    }
  }

  public TListSentryRolesResponse deepCopy() {
    return new TListSentryRolesResponse(this);
  }

  @Override
  public void clear() {
    this.status = null;
    this.roles = null;
  }

  public org.apache.sentry.service.thrift.TSentryResponseStatus getStatus() {
    return this.status;
  }

  public void setStatus(org.apache.sentry.service.thrift.TSentryResponseStatus status) {
    this.status = status;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  public int getRolesSize() {
    return (this.roles == null) ? 0 : this.roles.size();
  }

  public java.util.Iterator<TSentryRole> getRolesIterator() {
    return (this.roles == null) ? null : this.roles.iterator();
  }

  public void addToRoles(TSentryRole elem) {
    if (this.roles == null) {
      this.roles = new HashSet<TSentryRole>();
    }
    this.roles.add(elem);
  }

  public Set<TSentryRole> getRoles() {
    return this.roles;
  }

  public void setRoles(Set<TSentryRole> roles) {
    this.roles = roles;
  }

  public void unsetRoles() {
    this.roles = null;
  }

  /** Returns true if field roles is set (has been assigned a value) and false otherwise */
  public boolean isSetRoles() {
    return this.roles != null;
  }

  public void setRolesIsSet(boolean value) {
    if (!value) {
      this.roles = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((org.apache.sentry.service.thrift.TSentryResponseStatus)value);
      }
      break;

    case ROLES:
      if (value == null) {
        unsetRoles();
      } else {
        setRoles((Set<TSentryRole>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS:
      return getStatus();

    case ROLES:
      return getRoles();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STATUS:
      return isSetStatus();
    case ROLES:
      return isSetRoles();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TListSentryRolesResponse)
      return this.equals((TListSentryRolesResponse)that);
    return false;
  }

  public boolean equals(TListSentryRolesResponse that) {
    if (that == null)
      return false;

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_roles = true && this.isSetRoles();
    boolean that_present_roles = true && that.isSetRoles();
    if (this_present_roles || that_present_roles) {
      if (!(this_present_roles && that_present_roles))
        return false;
      if (!this.roles.equals(that.roles))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_status = true && (isSetStatus());
    list.add(present_status);
    if (present_status)
      list.add(status);

    boolean present_roles = true && (isSetRoles());
    list.add(present_roles);
    if (present_roles)
      list.add(roles);

    return list.hashCode();
  }

  @Override
  public int compareTo(TListSentryRolesResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRoles()).compareTo(other.isSetRoles());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRoles()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.roles, other.roles);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TListSentryRolesResponse(");
    boolean first = true;

    sb.append("status:");
    if (this.status == null) {
      sb.append("null");
    } else {
      sb.append(this.status);
    }
    first = false;
    if (isSetRoles()) {
      if (!first) sb.append(", ");
      sb.append("roles:");
      if (this.roles == null) {
        sb.append("null");
      } else {
        sb.append(this.roles);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetStatus()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'status' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (status != null) {
      status.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TListSentryRolesResponseStandardSchemeFactory implements SchemeFactory {
    public TListSentryRolesResponseStandardScheme getScheme() {
      return new TListSentryRolesResponseStandardScheme();
    }
  }

  private static class TListSentryRolesResponseStandardScheme extends StandardScheme<TListSentryRolesResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TListSentryRolesResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.status = new org.apache.sentry.service.thrift.TSentryResponseStatus();
              struct.status.read(iprot);
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ROLES
            if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
              {
                org.apache.thrift.protocol.TSet _set64 = iprot.readSetBegin();
                struct.roles = new HashSet<TSentryRole>(2*_set64.size);
                TSentryRole _elem65;
                for (int _i66 = 0; _i66 < _set64.size; ++_i66)
                {
                  _elem65 = new TSentryRole();
                  _elem65.read(iprot);
                  struct.roles.add(_elem65);
                }
                iprot.readSetEnd();
              }
              struct.setRolesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TListSentryRolesResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.status != null) {
        oprot.writeFieldBegin(STATUS_FIELD_DESC);
        struct.status.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.roles != null) {
        if (struct.isSetRoles()) {
          oprot.writeFieldBegin(ROLES_FIELD_DESC);
          {
            oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, struct.roles.size()));
            for (TSentryRole _iter67 : struct.roles)
            {
              _iter67.write(oprot);
            }
            oprot.writeSetEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TListSentryRolesResponseTupleSchemeFactory implements SchemeFactory {
    public TListSentryRolesResponseTupleScheme getScheme() {
      return new TListSentryRolesResponseTupleScheme();
    }
  }

  private static class TListSentryRolesResponseTupleScheme extends TupleScheme<TListSentryRolesResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TListSentryRolesResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.status.write(oprot);
      BitSet optionals = new BitSet();
      if (struct.isSetRoles()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetRoles()) {
        {
          oprot.writeI32(struct.roles.size());
          for (TSentryRole _iter68 : struct.roles)
          {
            _iter68.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TListSentryRolesResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.status = new org.apache.sentry.service.thrift.TSentryResponseStatus();
      struct.status.read(iprot);
      struct.setStatusIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TSet _set69 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.roles = new HashSet<TSentryRole>(2*_set69.size);
          TSentryRole _elem70;
          for (int _i71 = 0; _i71 < _set69.size; ++_i71)
          {
            _elem70 = new TSentryRole();
            _elem70.read(iprot);
            struct.roles.add(_elem70);
          }
        }
        struct.setRolesIsSet(true);
      }
    }
  }

}

