.class final synthetic Lr5/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final n:Lr5/p;


# direct methods
.method constructor <init>(Lr5/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr5/e;->n:Lr5/p;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lr5/e;->n:Lr5/p;

    const/4 v1, 0x2

    const-string v2, "Service disconnected"

    .line 2
    invoke-virtual {v0, v1, v2}, Lr5/p;->c(ILjava/lang/String;)V

    return-void
.end method
