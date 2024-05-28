.class public interface abstract Lub/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lub/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lub/l$a;

    invoke-direct {v0}, Lub/l$a;-><init>()V

    sput-object v0, Lub/l;->a:Lub/l;

    return-void
.end method


# virtual methods
.method public abstract a(ILjava/util/List;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lub/c;",
            ">;)Z"
        }
    .end annotation
.end method

.method public abstract b(ILjava/util/List;Z)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lub/c;",
            ">;Z)Z"
        }
    .end annotation
.end method

.method public abstract c(ILub/b;)V
.end method

.method public abstract d(ILac/e;IZ)Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method
