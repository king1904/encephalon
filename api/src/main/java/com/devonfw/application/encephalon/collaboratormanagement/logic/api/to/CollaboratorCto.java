package com.devonfw.application.encephalon.collaboratormanagement.logic.api.to;

import com.devonfw.module.basic.common.api.to.AbstractCto;

/**
 * Composite transport object of Collaborator
 */
public class CollaboratorCto extends AbstractCto {

  private static final long serialVersionUID = 1L;

  private CollaboratorEto collaborator;

  public CollaboratorEto getCollaborator() {

    return collaborator;
  }

  public void setCollaborator(CollaboratorEto collaborator) {

    this.collaborator = collaborator;
  }

}
