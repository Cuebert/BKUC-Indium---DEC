.class public final synthetic Lg6/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lg6/k;

.field public final synthetic o:Lg4/a;

.field public final synthetic p:Lg4/b;

.field public final synthetic q:Ljava/util/concurrent/Callable;

.field public final synthetic r:Lg4/m;


# direct methods
.method public synthetic constructor <init>(Lg6/k;Lg4/a;Lg4/b;Ljava/util/concurrent/Callable;Lg4/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg6/z;->n:Lg6/k;

    iput-object p2, p0, Lg6/z;->o:Lg4/a;

    iput-object p3, p0, Lg6/z;->p:Lg4/b;

    iput-object p4, p0, Lg6/z;->q:Ljava/util/concurrent/Callable;

    iput-object p5, p0, Lg6/z;->r:Lg4/m;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lg6/z;->n:Lg6/k;

    iget-object v1, p0, Lg6/z;->o:Lg4/a;

    iget-object v2, p0, Lg6/z;->p:Lg4/b;

    iget-object v3, p0, Lg6/z;->q:Ljava/util/concurrent/Callable;

    iget-object v4, p0, Lg6/z;->r:Lg4/m;

    invoke-virtual {v0, v1, v2, v3, v4}, Lg6/k;->f(Lg4/a;Lg4/b;Ljava/util/concurrent/Callable;Lg4/m;)V

    return-void
.end method
