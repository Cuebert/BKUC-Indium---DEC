.class public final synthetic Lw8/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Landroid/content/Context;

.field public final synthetic o:Lcom/google/common/util/concurrent/q;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lcom/google/common/util/concurrent/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw8/c;->n:Landroid/content/Context;

    iput-object p2, p0, Lw8/c;->o:Lcom/google/common/util/concurrent/q;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lw8/c;->n:Landroid/content/Context;

    iget-object v1, p0, Lw8/c;->o:Lcom/google/common/util/concurrent/q;

    invoke-static {v0, v1}, Lw8/d;->c(Landroid/content/Context;Lcom/google/common/util/concurrent/q;)V

    return-void
.end method
