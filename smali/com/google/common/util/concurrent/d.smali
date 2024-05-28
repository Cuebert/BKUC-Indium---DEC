.class public final synthetic Lcom/google/common/util/concurrent/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lcom/google/common/util/concurrent/e;

.field public final synthetic o:Lf5/b;


# direct methods
.method public synthetic constructor <init>(Lcom/google/common/util/concurrent/e;Lf5/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/common/util/concurrent/d;->n:Lcom/google/common/util/concurrent/e;

    iput-object p2, p0, Lcom/google/common/util/concurrent/d;->o:Lf5/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/common/util/concurrent/d;->n:Lcom/google/common/util/concurrent/e;

    iget-object v1, p0, Lcom/google/common/util/concurrent/d;->o:Lf5/b;

    invoke-static {v0, v1}, Lcom/google/common/util/concurrent/e;->M(Lcom/google/common/util/concurrent/e;Lf5/b;)V

    return-void
.end method
