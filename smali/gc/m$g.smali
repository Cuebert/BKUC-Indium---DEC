.class final Lgc/m$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgc/m;->d(Ljava/lang/Exception;Lva/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic n:Lva/c;

.field final synthetic o:Ljava/lang/Exception;


# direct methods
.method constructor <init>(Lva/c;Ljava/lang/Exception;)V
    .locals 0

    iput-object p1, p0, Lgc/m$g;->n:Lva/c;

    iput-object p2, p0, Lgc/m$g;->o:Ljava/lang/Exception;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lgc/m$g;->n:Lva/c;

    invoke-static {v0}, Lwa/b;->a(Lva/c;)Lva/c;

    move-result-object v0

    iget-object v1, p0, Lgc/m$g;->o:Ljava/lang/Exception;

    sget-object v2, Lta/h;->n:Lta/h$a;

    invoke-static {v1}, Lta/i;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lta/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lva/c;->d(Ljava/lang/Object;)V

    return-void
.end method
