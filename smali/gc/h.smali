.class public final synthetic Lgc/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lgc/g$b$a;

.field public final synthetic o:Lgc/d;

.field public final synthetic p:Lgc/t;


# direct methods
.method public synthetic constructor <init>(Lgc/g$b$a;Lgc/d;Lgc/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgc/h;->n:Lgc/g$b$a;

    iput-object p2, p0, Lgc/h;->o:Lgc/d;

    iput-object p3, p0, Lgc/h;->p:Lgc/t;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lgc/h;->n:Lgc/g$b$a;

    iget-object v1, p0, Lgc/h;->o:Lgc/d;

    iget-object v2, p0, Lgc/h;->p:Lgc/t;

    invoke-static {v0, v1, v2}, Lgc/g$b$a;->d(Lgc/g$b$a;Lgc/d;Lgc/t;)V

    return-void
.end method
