.class public final Lw/r0$a;
.super Ljava/lang/Exception;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw/r0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field n:Lw/r0;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lw/r0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 2
    iput-object p2, p0, Lw/r0$a;->n:Lw/r0;

    return-void
.end method


# virtual methods
.method public a()Lw/r0;
    .locals 1

    iget-object v0, p0, Lw/r0$a;->n:Lw/r0;

    return-object v0
.end method
