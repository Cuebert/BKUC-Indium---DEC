.class public final synthetic Lj5/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Ljava/util/Map$Entry;

.field public final synthetic o:Lp5/a;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map$Entry;Lp5/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj5/t;->n:Ljava/util/Map$Entry;

    iput-object p2, p0, Lj5/t;->o:Lp5/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lj5/t;->n:Ljava/util/Map$Entry;

    iget-object v1, p0, Lj5/t;->o:Lp5/a;

    invoke-static {v0, v1}, Lj5/u;->c(Ljava/util/Map$Entry;Lp5/a;)V

    return-void
.end method
