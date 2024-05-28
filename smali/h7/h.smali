.class public Lh7/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh7/f;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Li7/c;[Lh7/b$a;Lh7/l;)Lh7/d;
    .locals 7

    new-instance v6, Lh7/d;

    new-instance v0, Lb6/f;

    invoke-direct {v0}, Lb6/f;-><init>()V

    invoke-virtual {v0, p2}, Lb6/f;->s(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lcom/roblox/client/p0;->O()Ljava/lang/String;

    move-result-object v3

    move-object v0, v6

    move-object v1, p1

    move-object v4, p4

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lh7/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lh7/l;[Lh7/b$a;)V

    return-object v6
.end method

.method public b(Ljava/lang/String;[Lh7/b$a;Lh7/l;)Lh7/c;
    .locals 1

    new-instance v0, Lh7/c;

    invoke-direct {v0, p1, p3, p2}, Lh7/c;-><init>(Ljava/lang/String;Lh7/l;[Lh7/b$a;)V

    return-object v0
.end method
