.class public interface abstract Lr9/f;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract a(J)Lgc/b;
    .param p1    # J
        .annotation runtime Lic/s;
            value = "requesterUserId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Lgc/b<",
            "Lob/j0;",
            ">;"
        }
    .end annotation

    .annotation runtime Lic/o;
        value = "/v1/users/{requesterUserId}/accept-friend-request"
    .end annotation
.end method

.method public abstract b(J)Lgc/b;
    .param p1    # J
        .annotation runtime Lic/s;
            value = "requesterUserId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Lgc/b<",
            "Lob/j0;",
            ">;"
        }
    .end annotation

    .annotation runtime Lic/o;
        value = "/v1/users/{requesterUserId}/decline-friend-request"
    .end annotation
.end method
