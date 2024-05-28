.class Ln6/c$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln6/c$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln6/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Lh7/m;Ljava/lang/String;)Lh7/q;
    .locals 1

    new-instance v0, Lh7/q;

    invoke-direct {v0, p1, p2, p3, p4}, Lh7/q;-><init>(Ljava/lang/String;Ljava/lang/String;Lh7/m;Ljava/lang/String;)V

    return-object v0
.end method
