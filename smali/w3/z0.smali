.class final Lw3/z0;
.super Lw3/r;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lw3/r<",
        "TE;>;"
    }
.end annotation


# instance fields
.field private final p:Lw3/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw3/c1<",
            "TE;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lw3/c1;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw3/c1<",
            "TE;>;I)V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-direct {p0, v0, p2}, Lw3/r;-><init>(II)V

    iput-object p1, p0, Lw3/z0;->p:Lw3/c1;

    return-void
.end method


# virtual methods
.method protected final a(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    iget-object v0, p0, Lw3/z0;->p:Lw3/c1;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
