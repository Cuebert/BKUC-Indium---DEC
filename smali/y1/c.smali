.class public abstract Ly1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Ljava/lang/Object;)Ly1/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Ly1/c<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Ly1/a;

    sget-object v1, Ly1/d;->n:Ly1/d;

    const/4 v2, 0x0

    invoke-direct {v0, v2, p0, v1}, Ly1/a;-><init>(Ljava/lang/Integer;Ljava/lang/Object;Ly1/d;)V

    return-object v0
.end method

.method public static e(Ljava/lang/Object;)Ly1/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Ly1/c<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Ly1/a;

    sget-object v1, Ly1/d;->o:Ly1/d;

    const/4 v2, 0x0

    invoke-direct {v0, v2, p0, v1}, Ly1/a;-><init>(Ljava/lang/Integer;Ljava/lang/Object;Ly1/d;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()Ljava/lang/Integer;
.end method

.method public abstract b()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method public abstract c()Ly1/d;
.end method
