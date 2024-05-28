.class public interface abstract Lr9/i;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract a()Lgc/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lgc/b<",
            "Lob/j0;",
            ">;"
        }
    .end annotation

    .annotation runtime Lic/o;
        value = "/v2/push-notifications/deregister-current-device"
    .end annotation
.end method

.method public abstract b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lgc/b;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lic/t;
            value = "platformType"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lic/t;
            value = "notificationToken"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lic/t;
            value = "notificationId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lgc/b<",
            "Lob/j0;",
            ">;"
        }
    .end annotation

    .annotation runtime Lic/f;
        value = "/v2/push-notifications/metadata"
    .end annotation
.end method

.method public abstract c(Lt9/a;)Lgc/b;
    .param p1    # Lt9/a;
        .annotation runtime Lic/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt9/a;",
            ")",
            "Lgc/b<",
            "Lob/j0;",
            ">;"
        }
    .end annotation

    .annotation runtime Lic/o;
        value = "/v2/push-notifications/mark-as-read"
    .end annotation
.end method

.method public abstract d(Lt9/c;)Lgc/b;
    .param p1    # Lt9/c;
        .annotation runtime Lic/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt9/c;",
            ")",
            "Lgc/b<",
            "Lob/j0;",
            ">;"
        }
    .end annotation

    .annotation runtime Lic/o;
        value = "/v2/push-notifications/register-android-amazon"
    .end annotation
.end method

.method public abstract e()Lgc/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lgc/b<",
            "Lob/j0;",
            ">;"
        }
    .end annotation

    .annotation runtime Lic/o;
        value = "/v2/stream-notifications/clear-unread"
    .end annotation
.end method

.method public abstract f(Lt9/b;)Lgc/b;
    .param p1    # Lt9/b;
        .annotation runtime Lic/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt9/b;",
            ")",
            "Lgc/b<",
            "Lob/j0;",
            ">;"
        }
    .end annotation

    .annotation runtime Lic/o;
        value = "/v2/push-notifications/mark-category-as-read"
    .end annotation
.end method

.method public abstract g(Lt9/c;)Lgc/b;
    .param p1    # Lt9/c;
        .annotation runtime Lic/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt9/c;",
            ")",
            "Lgc/b<",
            "Lob/j0;",
            ">;"
        }
    .end annotation

    .annotation runtime Lic/o;
        value = "/v2/push-notifications/register-android-native"
    .end annotation
.end method
