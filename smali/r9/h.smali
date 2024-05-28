.class public interface abstract Lr9/h;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract a(JLjava/lang/String;)Lgc/b;
    .param p1    # J
        .annotation runtime Lic/s;
            value = "placeId"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lic/s;
            value = "eventType"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            ")",
            "Lgc/b<",
            "Lob/j0;",
            ">;"
        }
    .end annotation

    .annotation runtime Lic/o;
        value = "/v1/games/sessions/report/{placeId}/{eventType}"
    .end annotation
.end method
