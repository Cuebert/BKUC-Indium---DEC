.class public Lw/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw/j$a;
    }
.end annotation


# instance fields
.field private final a:Lw/j$a;


# direct methods
.method public constructor <init>(Lw/j$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lw/j;->a:Lw/j$a;

    return-void
.end method


# virtual methods
.method public a()Lw/j$a;
    .locals 1

    iget-object v0, p0, Lw/j;->a:Lw/j$a;

    return-object v0
.end method
