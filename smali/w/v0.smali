.class public final synthetic Lw/v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Ljava/util/concurrent/Executor;

.field public final synthetic o:Lcom/google/common/util/concurrent/m;

.field public final synthetic p:Landroidx/concurrent/futures/c$a;

.field public final synthetic q:J


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/Executor;Lcom/google/common/util/concurrent/m;Landroidx/concurrent/futures/c$a;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw/v0;->n:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lw/v0;->o:Lcom/google/common/util/concurrent/m;

    iput-object p3, p0, Lw/v0;->p:Landroidx/concurrent/futures/c$a;

    iput-wide p4, p0, Lw/v0;->q:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lw/v0;->n:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lw/v0;->o:Lcom/google/common/util/concurrent/m;

    iget-object v2, p0, Lw/v0;->p:Landroidx/concurrent/futures/c$a;

    iget-wide v3, p0, Lw/v0;->q:J

    invoke-static {v0, v1, v2, v3, v4}, Lw/w0;->d(Ljava/util/concurrent/Executor;Lcom/google/common/util/concurrent/m;Landroidx/concurrent/futures/c$a;J)V

    return-void
.end method
