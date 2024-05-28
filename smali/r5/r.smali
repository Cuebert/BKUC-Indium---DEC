.class final synthetic Lr5/r;
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

    iput-object p1, p0, Lr5/r;->n:Lr5/p;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lr5/r;->n:Lr5/p;

    invoke-virtual {v0}, Lr5/p;->g()V

    return-void
.end method
