.class public final synthetic Lu5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lcom/google/firebase/installations/b;

.field public final synthetic o:Z


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/installations/b;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu5/b;->n:Lcom/google/firebase/installations/b;

    iput-boolean p2, p0, Lu5/b;->o:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lu5/b;->n:Lcom/google/firebase/installations/b;

    iget-boolean v1, p0, Lu5/b;->o:Z

    invoke-static {v0, v1}, Lcom/google/firebase/installations/b;->a(Lcom/google/firebase/installations/b;Z)V

    return-void
.end method
