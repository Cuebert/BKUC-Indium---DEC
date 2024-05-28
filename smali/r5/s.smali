.class final synthetic Lr5/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field private final a:Lr5/p;


# direct methods
.method constructor <init>(Lr5/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr5/s;->a:Lr5/p;

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 1

    iget-object v0, p0, Lr5/s;->a:Lr5/p;

    invoke-virtual {v0, p1}, Lr5/p;->d(Landroid/os/Message;)Z

    move-result p1

    return p1
.end method
