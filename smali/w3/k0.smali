.class final Lw3/k0;
.super Lw3/n0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lw3/n0<",
        "Ljava/util/Map$Entry;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic r:Lw3/r0;


# direct methods
.method constructor <init>(Lw3/r0;)V
    .locals 1

    iput-object p1, p0, Lw3/k0;->r:Lw3/r0;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lw3/n0;-><init>(Lw3/r0;Lw3/j0;)V

    return-void
.end method


# virtual methods
.method final bridge synthetic a(I)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lw3/p0;

    iget-object v1, p0, Lw3/k0;->r:Lw3/r0;

    invoke-direct {v0, v1, p1}, Lw3/p0;-><init>(Lw3/r0;I)V

    return-object v0
.end method
