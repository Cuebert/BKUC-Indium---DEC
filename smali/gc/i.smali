.class public final synthetic Lgc/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lgc/g$b$a;

.field public final synthetic o:Lgc/d;

.field public final synthetic p:Ljava/lang/Throwable;


# direct methods
.method public synthetic constructor <init>(Lgc/g$b$a;Lgc/d;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgc/i;->n:Lgc/g$b$a;

    iput-object p2, p0, Lgc/i;->o:Lgc/d;

    iput-object p3, p0, Lgc/i;->p:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lgc/i;->n:Lgc/g$b$a;

    iget-object v1, p0, Lgc/i;->o:Lgc/d;

    iget-object v2, p0, Lgc/i;->p:Ljava/lang/Throwable;

    invoke-static {v0, v1, v2}, Lgc/g$b$a;->c(Lgc/g$b$a;Lgc/d;Ljava/lang/Throwable;)V

    return-void
.end method
